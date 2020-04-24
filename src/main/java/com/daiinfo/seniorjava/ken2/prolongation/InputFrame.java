package java.com.daiinfo.seniorjava.ken2.prolongation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class InputFrame extends JFrame implements ActionListener{
	
	final long serialVersionUID = -4595347311922711984L;
	private JTextField nameJTextField;
	private JTextField addressJTextField;
	private JComboBox sexJComboBox;
	private JTextField emailJTextField;
	private JComboBox provinceJComboBox;
	private JComboBox cityJComboBox;
	private JLabel  nameJLabel;
	private JLabel  sexJLabel;
	private JLabel  provinceJLabel;
	private JLabel  cityJLabel;
	private JLabel  emailJLabel;
	private JLabel  addressJLabel;
	private JLabel  nativePlaceJLabel;
	private JButton saveButton;
	private JButton cancelButton;
	private JTextArea infoArea;
	
	

	/**
	 * 构造函数
	 */
	public InputFrame(String title) {
		super(title);
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nameJTextField=new JTextField(20);
		addressJTextField=new JTextField();
		emailJTextField=new JTextField(30);
		
		sexJComboBox=new JComboBox();
		sexJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"男","女"}));
		
		provinceJComboBox=new JComboBox<>();
		cityJComboBox=new JComboBox<>();
				
		nameJLabel=new JLabel("姓名");
	    sexJLabel=new JLabel("性别");
	    nativePlaceJLabel=new JLabel("籍贯");
	    provinceJLabel=new JLabel("省");
	    cityJLabel=new JLabel("市");
		addressJLabel=new JLabel("通讯地址");
		emailJLabel=new JLabel("邮箱");
				
		final JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout());
		pan1.setBorder(new TitledBorder(null, "基本信息", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		pan1.setBounds(12, 12, 418, 70);
		getContentPane().add(pan1);
		pan1.add(nameJLabel);
		pan1.add(nameJTextField);
		pan1.add(sexJLabel);
		pan1.add(sexJComboBox);
				
		final JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout());
		pan2.setBounds(12, 98, 418, 70);
		pan2.setBorder(new TitledBorder(null, "籍贯", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		getContentPane().add(pan2);
		pan2.add(provinceJLabel);
		pan2.add(provinceJComboBox);
		pan2.add(cityJLabel);
		pan2.add(cityJComboBox);
		
		
		provinceJComboBox.addItemListener(new ItemListener(){
			public void itemStateChanged(final ItemEvent e) { // 选项状态更改事件
				itemChange();
			}
		});
		
		provinceJComboBox.setModel(new DefaultComboBoxModel(getProvince())); // 添加省份信息
		String province=(String)getProvince()[0];
		cityJComboBox.setModel(new DefaultComboBoxModel(getCity(province)));
		
		final JPanel pan3 = new JPanel();
		pan3.setLayout(new GridLayout());
		pan3.setBounds(12, 178, 418, 70);
		pan3.setBorder(new TitledBorder(null, "通讯地址", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		getContentPane().add(pan3);
		pan3.add(addressJLabel);
		pan3.add(addressJTextField);
		pan3.add(emailJLabel);
		pan3.add(emailJTextField);
		
		final JPanel pan4 = new JPanel();
		pan4.setLayout(null);
		pan4.setBounds(12, 278, 418, 70);
		pan4.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		getContentPane().add(pan4);
		saveButton=new JButton("保存");
		saveButton.setBounds(80,20,60, 40);
		
		cancelButton=new JButton("取消");
		cancelButton.setBounds(280,20,60, 40);
		pan4.add(saveButton);
		pan4.add(cancelButton);
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		infoArea=new JTextArea("基本信息",100,200);
		infoArea.setBounds(12, 360, 420, 200);
		add(infoArea);
		
		
	}
	
	
	/**
	 * 获取省、直辖市，自治区
	 * 
	 * @return
	 */
	public Object[] getProvince() {
		Map<String, String[]> map = CityMap.model;// 获取省份信息保存到Map中
		Set<String> set = map.keySet(); // 获取Map集合中的键，并以Set集合返回
		Object[] province = set.toArray(); // 转换为数组
		return province; // 返回获取的省份信息
	}
	
	/**
	 * 获取指定省对应的市/县
	 * 
	 * @param selectProvince
	 * @return
	 */
	public String[] getCity(String selectProvince) {
		Map<String, String[]> map = CityMap.model; // 获取省份信息保存到Map中
		String[] arrCity = map.get(selectProvince); // 获取指定键的值
		return arrCity; // 返回获取的市/县
	}

    private void itemChange() {
        String selectProvince = (String) provinceJComboBox.getSelectedItem();
        cityJComboBox.removeAllItems(); // 清空市/县列表
        String[] arrCity = getCity(selectProvince); // 获取市/县
        cityJComboBox.setModel(new DefaultComboBoxModel(arrCity)); // 重新添加市/县列表的值
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==saveButton){
			infoArea.append("\n");
			String string="";
			string+="\n"+"姓名："+nameJTextField.getText();
			string+="\n"+"性别："+sexJComboBox.getSelectedItem();
			string+="\n"+"籍贯："+provinceJComboBox.getSelectedItem()+"省"+cityJComboBox.getSelectedItem()+"市/县";
			string+="\n"+"通讯地址："+addressJTextField.getText();
			string+="\n"+"邮箱："+emailJTextField.getText();
			infoArea.append(string);
		}
		
		if(e.getSource()==cancelButton){
			infoArea.setText("基本信息");
		}
	}
}

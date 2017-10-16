import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EmployeeInfoManager {


	public static void readAllEmployeeFromFile() throws IOException {
		                 // 创建数组对象，以存储所有员工信息
		allEmployee= new Employee[MAX_EMPLOYEE_COUNT];	
		               // 存储所有员工信息的文件路径
		final String filePath = "E:\\EmployeeInfo.txt";
		              // 从文件中读取信息的对象
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		            // 每次读取一行，该变量存储读取的一行数据
		String line;
		          // 采用制表符 \t 为分隔符，把一行数据进行分割得到的字符串数组，长度应该为 4
		// 下标从 0 到 3 分别存储了员工姓名、水平、职位和研究方向
		String [] values;
		// 员工对象，准备给各成员变量赋值并添加到数组对象中
		Employee empolyee = null;
		// 从文件中读取一行，因为是第一次读取，因此实际上读取的是首行
		line = reader.readLine();
		// 数组下标，从 0 开始，把 Employee 添加到数组时其下标即为 i
		// 每添加一个Employee 对象，i 自增 1，即：i++
		int i = 0;
		// 如果没有达到文件的末尾
		while (line != null) {
			// 新建一个Goods 对象，用于存储该行的员工信息
			empolyee = new Employee();
			// 把读取的一行数据使用制表符 \t 进行分割，得到包含员工信息的字符串数组
			values = line.split("\t");
			// 调用 setter 方法
			// 把文件中的商品信息赋值给 Employee 对象的各个成员变量
			
			empolyee.setName(values[0]);
			empolyee.setLevel(values[1]);
			empolyee.setPosition(values[2]);
			empolyee.setResearch(values[3]);
			// 把 employee对象添加到对象数组中
			allEmployee[i] = empolyee;
			// 下标自增 1
			i++;
			// 当前行已经处理完毕，继续读取下一行
			line = reader.readLine();
		}
		// 设置实际存储的商品的数量
		actualEmployeeCount = i;
		// 关闭文件读取对象
		reader.close();
		// 测试，输出全部员工姓名
		for (i = 0; i <= actualEmployeeCount - 1; i++) {
			System.out.println(allEmployee[i]);
		}
	}	

	// 对象数组，用于存储所有商品信息
	private static Employee [] allEmployee;
	// 常量，用于存储能够存存员工信息的最大容量数
	private static final int MAX_EMPLOYEE_COUNT = 100;
	// 变量，用于存储员工信息，文件读取结束后该值就存储了文件中的员工水平
	private static int actualEmployeeCount = 0;

	
	public static void queryEmployeeByName(String EmployeeName){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查询员工的姓名：");
		EmployeeName = sc.next();
		boolean flag=false;
		 for (int j = 0; j <= actualEmployeeCount - 1; j++){
			 String name=allEmployee[j].getName();
			 if (EmployeeName.equals(name))
			 {
    			 System.out.println(allEmployee[j]);
    			 flag=true;
    		//break;
    		 }
		 }
			if(flag==false)
			 System.out.println("没有该员工"); 
		 
	}
    public static void queryEmployeeByLevel(String EmployeeLevel){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("请输入要查询的员工水平：");
    	EmployeeLevel = sc.next();
		boolean flag=false;
		 for (int j = 0; j <= actualEmployeeCount - 1; j++){
			 String level=allEmployee[j].getLevel();
			 if (EmployeeLevel.equals(level))
			 {
    			 System.out.println(allEmployee[j]);
    			 flag=true;
           //  break;
    		 } 
    }
		 if(flag==false)
		 System.out.println("没该水平的员工");	}
    
      public static void queryEmployeeByPosition(String EmployeePosition){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("请输入要查查询的员工职位：");
    	EmployeePosition = sc.next();
		boolean flag=false;
		 for (int j = 0; j <= actualEmployeeCount - 1; j++){
			 String position=allEmployee[j].getPosition();
			 if (Employee.equals(position))
			 {
    			 System.out.println(allEmployee[j]);
    			 flag=true;
    			 //  break;
    		 }
		   }	
			 if(flag==false)
			 System.out.println("没有该职位的员工"); 
	 	
    }
    public static void queryEmployeeByResearch(String EmployeeResearch){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("请输入要查询员工的研究方向：");
    	EmployeeResearch = sc.next();
    	boolean flag=false;
		 for (int j = 0; j <= actualEmployeeCount - 1; j++){
			 String Research=allEmployee[j].getResearch();
			 if (EmployeeResearch.equals(Research))
			 {
    			 System.out.println(allEmployee[j]);
    			 flag=true;
    			 //  break;
			 }
		  }	
			if(flag==false)
			 System.out.println("没有该研究方向的员工"); 
    }
    public static void addEmployee (Employee newEmpolyee)throws IOException {
    	
            String x=null,y=null,z=null,w=null;
	        System.out.println("请输入要添加的员工姓名");
	          Scanner s1=new Scanner(System.in);
              x=s1.next();
            System.out.println("请输入员工水平");
	          Scanner s2=new Scanner(System.in);
              y=s2.next();
            System.out.println("请输入员工职位");
              Scanner s3=new Scanner(System.in);
              z=s3.next();
            System.out.println("请输入员工研究方向");
	          Scanner s4=new Scanner(System.in);
              w=s4.next();
              System.out.println("新员工已添加成功~~");
             final String filePath = "E:\\EmployeeInfo.txt";
              BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
               writer.write(x);
               writer.write("\t");
               writer.write(y);
               writer.write("\t");
               writer.write(z);
               writer.write("\t");
               writer.write(w);
               writer.write("\t");
               writer.newLine();
               writer.flush();
               writer.close();
             actualEmployeeCount++;
                }
    
    public static void UpdateEmployee() throws IOException{
    	System.out.println("请输入要修改的员工姓名：");
		Scanner sc=new Scanner(System.in);
		String x=sc.next();		
		String a=null,y=null,z=null,d=null;
		int i;
		for (i= 0; i<=EmployeeInfoManager.actualEmployeeCount - 1; i++) {
		    if(x.equals(EmployeeInfoManager.allEmployee[i].getName())){				
				System.out.println("请输入新的信息：");
				System.out.println("请输入要更新的员工姓名：");	
				Scanner s1=new Scanner(System.in);
				a=s1.next();
				EmployeeInfoManager.allEmployee[i].setName(a);
				System.out.println("请输入要更新的商品的水平：");
				Scanner s2=new Scanner(System.in);
				y=s2.next();
				EmployeeInfoManager.allEmployee[i].setLevel(y);
				System.out.println("请输入要更新员工职位：");
				Scanner s3=new Scanner(System.in);
				z=s3.next();
				EmployeeInfoManager.allEmployee[i].setPosition(z);
				System.out.println("请输入要更新的员工的研究方向：");
				Scanner s4=new Scanner(System.in);
				d=s4.next();
				EmployeeInfoManager.allEmployee[i].setResearch(d);
				System.out.println("员工已更新成功~");
				break;				
				}		   
	    }
	    
		  if(i==EmployeeInfoManager.actualEmployeeCount)
				System.out.println("对不起,没有员工。请重新选择需要的服务项：");  		
		
		  
		  final String filePath = "E:\\EmployeeInfo.txt";
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		    for (i= 0; i<= EmployeeInfoManager.actualEmployeeCount - 1; i++) {
			    writer.write(EmployeeInfoManager.allEmployee[i].getName());
			    writer.write("\t");
			    writer.write(EmployeeInfoManager.allEmployee[i].getLevel());
	
			    
			    writer.write("\t");
		    	writer.write(EmployeeInfoManager.allEmployee[i].getPosition());
		    	writer.write("\t");
		    	writer.write(EmployeeInfoManager.allEmployee[i].getResearch());
		    	writer.write("\t");
		    	writer.newLine();
		    	writer.flush();
		}
		        writer.close();
	
	}
}


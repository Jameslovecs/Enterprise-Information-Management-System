import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EmployeeInfoManager {


	public static void readAllEmployeeFromFile() throws IOException {
		                 // ������������Դ洢����Ա����Ϣ
		allEmployee= new Employee[MAX_EMPLOYEE_COUNT];	
		               // �洢����Ա����Ϣ���ļ�·��
		final String filePath = "E:\\EmployeeInfo.txt";
		              // ���ļ��ж�ȡ��Ϣ�Ķ���
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		            // ÿ�ζ�ȡһ�У��ñ����洢��ȡ��һ������
		String line;
		          // �����Ʊ�� \t Ϊ�ָ�������һ�����ݽ��зָ�õ����ַ������飬����Ӧ��Ϊ 4
		// �±�� 0 �� 3 �ֱ�洢��Ա��������ˮƽ��ְλ���о�����
		String [] values;
		// Ա������׼��������Ա������ֵ����ӵ����������
		Employee empolyee = null;
		// ���ļ��ж�ȡһ�У���Ϊ�ǵ�һ�ζ�ȡ�����ʵ���϶�ȡ��������
		line = reader.readLine();
		// �����±꣬�� 0 ��ʼ���� Employee ��ӵ�����ʱ���±꼴Ϊ i
		// ÿ���һ��Employee ����i ���� 1������i++
		int i = 0;
		// ���û�дﵽ�ļ���ĩβ
		while (line != null) {
			// �½�һ��Goods �������ڴ洢���е�Ա����Ϣ
			empolyee = new Employee();
			// �Ѷ�ȡ��һ������ʹ���Ʊ�� \t ���зָ�õ�����Ա����Ϣ���ַ�������
			values = line.split("\t");
			// ���� setter ����
			// ���ļ��е���Ʒ��Ϣ��ֵ�� Employee ����ĸ�����Ա����
			
			empolyee.setName(values[0]);
			empolyee.setLevel(values[1]);
			empolyee.setPosition(values[2]);
			empolyee.setResearch(values[3]);
			// �� employee������ӵ�����������
			allEmployee[i] = empolyee;
			// �±����� 1
			i++;
			// ��ǰ���Ѿ�������ϣ�������ȡ��һ��
			line = reader.readLine();
		}
		// ����ʵ�ʴ洢����Ʒ������
		actualEmployeeCount = i;
		// �ر��ļ���ȡ����
		reader.close();
		// ���ԣ����ȫ��Ա������
		for (i = 0; i <= actualEmployeeCount - 1; i++) {
			System.out.println(allEmployee[i]);
		}
	}	

	// �������飬���ڴ洢������Ʒ��Ϣ
	private static Employee [] allEmployee;
	// ���������ڴ洢�ܹ����Ա����Ϣ�����������
	private static final int MAX_EMPLOYEE_COUNT = 100;
	// ���������ڴ洢Ա����Ϣ���ļ���ȡ�������ֵ�ʹ洢���ļ��е�Ա��ˮƽ
	private static int actualEmployeeCount = 0;

	
	public static void queryEmployeeByName(String EmployeeName){
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ѯԱ����������");
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
			 System.out.println("û�и�Ա��"); 
		 
	}
    public static void queryEmployeeByLevel(String EmployeeLevel){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("������Ҫ��ѯ��Ա��ˮƽ��");
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
		 System.out.println("û��ˮƽ��Ա��");	}
    
      public static void queryEmployeeByPosition(String EmployeePosition){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("������Ҫ���ѯ��Ա��ְλ��");
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
			 System.out.println("û�и�ְλ��Ա��"); 
	 	
    }
    public static void queryEmployeeByResearch(String EmployeeResearch){
    	Scanner sc=new Scanner (System.in);
    	System.out.println("������Ҫ��ѯԱ�����о�����");
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
			 System.out.println("û�и��о������Ա��"); 
    }
    public static void addEmployee (Employee newEmpolyee)throws IOException {
    	
            String x=null,y=null,z=null,w=null;
	        System.out.println("������Ҫ��ӵ�Ա������");
	          Scanner s1=new Scanner(System.in);
              x=s1.next();
            System.out.println("������Ա��ˮƽ");
	          Scanner s2=new Scanner(System.in);
              y=s2.next();
            System.out.println("������Ա��ְλ");
              Scanner s3=new Scanner(System.in);
              z=s3.next();
            System.out.println("������Ա���о�����");
	          Scanner s4=new Scanner(System.in);
              w=s4.next();
              System.out.println("��Ա������ӳɹ�~~");
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
    	System.out.println("������Ҫ�޸ĵ�Ա��������");
		Scanner sc=new Scanner(System.in);
		String x=sc.next();		
		String a=null,y=null,z=null,d=null;
		int i;
		for (i= 0; i<=EmployeeInfoManager.actualEmployeeCount - 1; i++) {
		    if(x.equals(EmployeeInfoManager.allEmployee[i].getName())){				
				System.out.println("�������µ���Ϣ��");
				System.out.println("������Ҫ���µ�Ա��������");	
				Scanner s1=new Scanner(System.in);
				a=s1.next();
				EmployeeInfoManager.allEmployee[i].setName(a);
				System.out.println("������Ҫ���µ���Ʒ��ˮƽ��");
				Scanner s2=new Scanner(System.in);
				y=s2.next();
				EmployeeInfoManager.allEmployee[i].setLevel(y);
				System.out.println("������Ҫ����Ա��ְλ��");
				Scanner s3=new Scanner(System.in);
				z=s3.next();
				EmployeeInfoManager.allEmployee[i].setPosition(z);
				System.out.println("������Ҫ���µ�Ա�����о�����");
				Scanner s4=new Scanner(System.in);
				d=s4.next();
				EmployeeInfoManager.allEmployee[i].setResearch(d);
				System.out.println("Ա���Ѹ��³ɹ�~");
				break;				
				}		   
	    }
	    
		  if(i==EmployeeInfoManager.actualEmployeeCount)
				System.out.println("�Բ���,û��Ա����������ѡ����Ҫ�ķ����");  		
		
		  
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


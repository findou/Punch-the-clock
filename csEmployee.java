import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class csEmployee {


    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name= sc.nextLine();
        System.out.println("请输入上班时间：录入格式2019-09-20 08:45:40 ");
        String start=sc.nextLine();
        System.out.println("请输入下班时间：录入格式2019-09-20 08:45:40 ");
        String end=sc.nextLine();


        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime=s.parse(start);
        Date endTime=s.parse(end);
        //创建一个员工类的对象
        Employee e=new Employee();

        e.setName(name);
        e.setStartTime(startTime);
        e.setEndTime(endTime);

        //输出
        System.out.println(e.toString());
        SimpleDateFormat s2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String stime=s2.format(e.getStartTime());
        String etime=s2.format(e.getEndTime());
        System.out.println("姓名："+e.getName()+"上班时间："+stime+"下班时间："+etime);

    }
}

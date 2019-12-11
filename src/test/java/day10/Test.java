package day10;

import java.util.Calendar;
import java.util.Date;

public class Test {
	//日期获取年龄
	public static int dang(Date d){
		Calendar ca = Calendar.getInstance();
		ca.setTime(d);
		int j = ca.get(Calendar.YEAR);
		int i = ca.get(Calendar.YEAR);
		return j-i;
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public static Date huo(Date d){
		Calendar ca = Calendar.getInstance();
		ca.setTime(d);
		ca.get(Calendar.MONDAY);
		ca.get(Calendar.YEAR);
		ca.get(Calendar.MONTH);
		return ca.getTime();
	}
	
	//根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date run(Date d){
		Calendar ca = Calendar.getInstance();
		ca.setTime(d);
		ca.set(Calendar.MONDAY,1);
		ca.set(Calendar.YEAR,1);
		ca.set(Calendar.HOUR,0);
		return ca.getTime();
	}
	
	//求未来日期离今天还剩的天数
	public static int li(Date d){
		Date now = new Date();
		return (int) ((d.getTime())-(now.getTime())/(60*60*24*1000));
	}
	
	//求过去日期离今天过去的天数
	public static int guoqu(Date d){
		Date now = new Date();
		return (int) ((now.getTime())-(d.getTime())/(60*60*24*1000));
	}
}

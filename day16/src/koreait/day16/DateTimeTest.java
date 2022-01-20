package koreait.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
	
	// 날짜와 시간형식을 다루는 자바클래스 연습
	// 1) java.util.Data 클래스	2) java.util.Calendar클래스
	// 3) java 8버전 LocalData(날짜), LocalTime(시간), LocalDateTime(날짜와 시간) 클래스
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("날짜 확인 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인 : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("날짜와 시간 확인 : " + currentDateTime);
		
		// 임의의 날짜/시간으로 객체 생성
		LocalDate mybirth = LocalDate.of(1999, 1, 11);
		System.out.println("내 생일 확인 : " + mybirth);
		
		LocalTime birthTime = LocalTime.of(15, 40);
		System.out.println("내 탄생시간 확인 : " + birthTime);
		
		LocalDateTime mybirth_date_time = LocalDateTime.of(mybirth, birthTime);
		System.out.println("내 생일 날짜와 시간 확인 :" + mybirth_date_time);
		
		
		// 현재 날짜로부터 5일 후 계산
		int day = 5;
		System.out.println("오늘 날짜 " + day + "일 후는 " + currentDate.plusDays(day));
		
		day = 30;
		System.out.println("오늘 날짜 " + day + "일 전은 " + currentDate.minusDays(day));
		
		// 내가 태어난지 몇일이 지났는지(날짜 사이의 간격 계산)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난지 " + between.getYears() + "년 됐습니다.");
		System.out.println("내가 태어난지 " + between.getMonths() + "개월 됐습니다.");
		System.out.println("내가 태어난지 " + between.getDays() + "일 됐습니다.");
		
		long test = ChronoUnit.DAYS.between(mybirth, currentDate);
		System.out.println("test = " + test);
		
		test = ChronoUnit.YEARS.between(mybirth, currentDate);
		System.out.println("test = " + test);
		
		// Duration 클래스 : 시간간격 계산할 때 사용 메소드 있습니다.
		// ChronoUnit : 시, 분, 초, 년, 월, 주, 일 단위로 모두 사용할 메소드가 있습니다.
	}

}

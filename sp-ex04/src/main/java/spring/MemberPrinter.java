package spring;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;
	
	public MemberPrinter() {
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	}
	
	public void print(Member member) {
		if (dateTimeFormatter == null) {
			System.out.printf(
					"Account Information: id=%d, email=%s, name=%s, date=%tF\n",
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		}
		else {
			System.out.printf(
					"Account Information: id=%d, email=%s, name=%s, date=%s\n",
					member.getId(), member.getEmail(),
					member.getName(),
					dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
	
	@Autowired(required=false)
	public void setDateFormatter(DateTimeFormatter formatterOpt) {
		this.dateTimeFormatter = formatterOpt;
	}
}
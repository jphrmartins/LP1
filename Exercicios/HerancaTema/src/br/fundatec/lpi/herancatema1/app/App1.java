package br.fundatec.lpi.herancatema1.app;

import br.fundatec.lpi.herancatema1.Professor;
import br.fundatec.lpi.herancatema1.Student;

public class App1 {
	public static void main(String[] args) {
		Professor everton = new Professor("Everton", "365.214.789-26", 50, 4);
		Student jp = new Student("jp", "356.005.390-53", 50, 4, false);
		System.out.println("Professor: " + everton.getNm_name() + ", " + everton.getDs_cpf());
		System.out.println("Work " + everton.getHr_work() + "H");
		System.out.println(
				"have a Quota of print of: " + everton.getNr_printQuota() + ". Demanding a increase in the Quota");
		everton.extendQuotaPrint(20);
		System.out.println("Student: " + jp.getNm_name() + ", " + jp.getDs_cpf());
		System.out.println("Stddy " + jp.getNr_subjects() + " Subjects");
		System.out
				.println("have a Quota of print of: " + jp.getNr_printQuota() + ". Demanding a increase in the Quota");
		jp.extendQuotaPrint(20);

	}

}

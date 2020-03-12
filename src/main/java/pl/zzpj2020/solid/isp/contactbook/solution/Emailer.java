package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Emailer {

	void sendEmail(Emailable emailable, String subject, String body);
}
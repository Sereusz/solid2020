package pl.zzpj2020.solid.isp.contactbook.solution;

public class MultiFunctionalDevice implements Dialler, Emailer {
    @Override
    public void makeCall(Dialable dialable) {
        String number = dialable.getTelephone();
        //Make a call
    }

    @Override
    public void sendEmail(Emailable emailable, String subject, String body) {
        String email = emailable.getEmailAddress();
        //send e-amil
    }
}

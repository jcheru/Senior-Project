import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Comment;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
public class Rcarz {

  public static void main(String[] args) throws Exception {
    BasicCredentials creds = new BasicCredentials("jcheruve", "123oiu");
    JiraClient jira = new JiraClient("http://issues.apache.org/jira", creds);

    Issue issue1 = jira.getIssue("ZOOKEEPER-2982");
    String comment = "";
    for (Comment c : issue1.getComments()) {
      comment += c.getBody();
    }

    SSWrapper s_s = new SSWrapper();

    String proc = s_s.process(comment);

    System.out.println(s_s.compute(proc));

  }

}

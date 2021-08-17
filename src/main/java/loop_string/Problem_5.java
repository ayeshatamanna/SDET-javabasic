/* <html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>
 Extract only transaction ID from the HTML*/
package loop_string;
public class Problem_5 {
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>";
        System.out.println("Transaction ID: "+str.substring(42,62));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfilejar;
import java.util.ArrayList;
import java.util.Scanner;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;
/**
 *
 * @author Admin
 */
class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student st;
    private Subject sj;

    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String tensv = sc.nextLine();
        int somh = Integer.parseInt(sc.nextLine());
        String mamh, tenmh;
        int sotin;
        st = new Student(ma, tensv);
        double sum = 0;
        ArrayList<Subject> arr = new ArrayList<>();
        while(somh-->0)
        {
            
            mamh= sc.nextLine();
            tenmh = sc.nextLine();
            sotin = Integer.parseInt(sc.nextLine());
            arr.add(new Subject(tenmh, mamh, sotin));
            
        }
        String soQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double dg = Double.parseDouble(sc.nextLine());
        for(Subject x : arr)
        {
            sum += dg * x.getCredit();
        }
        rule = new Rule(soQD, tenQD, sum);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arr);
        invoice.setAmount(sum);
        invoice.setSt(st);
    }
    public Invoice getInvoice()
    {
        return invoice;
    }
    
}
public class Test {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
/*
B20DCCN001
Nguyễn Văn A
2
INT1155
Tin học cơ sở 2
2
INT1332
Lập trình hướng đối tượng
3
QD123
QD123 HP
550000
*/
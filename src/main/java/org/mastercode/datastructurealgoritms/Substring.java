package org.mastercode.datastructurealgoritms;

public class Substring {
    public static void main(String[] args) {
        String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetPrePayments2Response xmlns=\"http://tempuri.org/\"><GetPrePayments2Result>&lt;DocumentElement&gt;\n" +
                "  &lt;PIResult&gt;\n" +
                "    &lt;PrePaymentNumber&gt;GQA2400136464&lt;/PrePaymentNumber&gt;\n" +
                "    &lt;TotalInsurancePrice&gt;0&lt;/TotalInsurancePrice&gt;\n" +
                "    &lt;Insurer /&gt;\n" +
                "    &lt;Success&gt;0&lt;/Success&gt;\n" +
                "    &lt;ErrorMsg&gt;Ödəniş kodu tapılmadı.&lt;/ErrorMsg&gt;\n" +
                "  &lt;/PIResult&gt;\n" +
                "&lt;/DocumentElement&gt;</GetPrePayments2Result></GetPrePayments2Response></soap:Body></soap:Envelope>";
        String substring = str.substring( 38);
        System.out.println(substring); // Output: World
    }
}

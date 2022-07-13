//package ch12;
//
//import java.lang.annotation.Annotation;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//
//@Deprecated
//@MailInfo(mailId = 2, sender = "testUser", receivers={"test1@example.com", "test2@example.com"},testType = TestType.FINAL, testDate = @DateTime(yymmdd = "123242", hhmmss = "231222"))
//public class AnnotationTest {
//
//    public static void main(String[] args) {
//        Class<AnnotationTest> cls = AnnotationTest.class;
//
//        MailInfo mailInfo = (MailInfo) cls.getAnnotation(MailInfo.class);
//        System.out.println("anno.mailId : "+ mailInfo.mailId());
//        for (String item:mailInfo.receivers()
//             ) {
//            System.out.println("item = " + item);
//        }
//
//        Annotation[] annoArr = cls.getAnnotations();
//
//		for(Annotation a : annoArr)
//			System.out.println(a);
//    }
//
//
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@interface MailInfo{
//    int mailId()    default 1;
//    String sender();
//    String[] receivers() default "None";
//    TestType testType();
//    DateTime testDate();
//
//
//}
//
//@Retention(RetentionPolicy.RUNTIME)  // ���� �ÿ� ��밡���ϵ��� ����
//@interface DateTime {
//    String yymmdd();
//    String hhmmss();
//}
//enum TestType { FIRST, FINAL }
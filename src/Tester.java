/**
 * Tester class for the stack and queue classes
 *
 * @author kyle Adams, Dennis P
 * @version (11/21/19)
 */
import stack.*;
import queue.*;
import java.util.StringTokenizer;

public class Tester
{
    public static void main(String[] args){
        ArrayListStack<String> s1 = new ArrayListStack<String>();
        ArrayListStack<String> s2 = new ArrayListStack<String>();
        ArrayListStack<String> s3 = new ArrayListStack<String>();

        String dataForS1 = ("Not everything that can be counted counts, " +
                "and not everything that counts can be counted");
        String dataForS2 = ("Not everything that can be counted counts, and " +
                "not everything that counts can be counted");
        String dataForS3 = ("Only two things are infinite, the universe and " +
                "human stupidity, and I'm not sure " +
                "about the former");
        //---------------------------------------------------------------------
        ArrayListQueue<String> q1 = new ArrayListQueue<String>();
        ArrayListQueue<String> q2 = new ArrayListQueue<String>();
        ArrayListQueue<String> q3 = new ArrayListQueue<String>();

        String dataForQ1 = "Not everything that can be counted counts, and " +
                "not everything that counts can be counted";

        String dataForQ2 = "Not everything that can be counted counts, and " +
                "not everything that counts can be counted";

        String dataForQ3 = "Only two things are infinite, the universe and " +
                "human stupidity, and I'm not sure about the former.";
        //-----------------------------------------------------------------------                    
        /**
         * Splits the strings for s1 s2 and s3 
         */
        StringTokenizer st1 = new StringTokenizer(dataForS1, " ");
        while (st1.hasMoreTokens())
            s1.push(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(dataForS2, " ");
        while (st2.hasMoreTokens())
            s2.push(st2.nextToken());

        StringTokenizer st3 = new StringTokenizer(dataForS3, " ");
        while (st3.hasMoreTokens())
            s3.push(st3.nextToken());

        /**
         * Splits the strings for q1 q2 q3
         */

        StringTokenizer que1 = new StringTokenizer(dataForQ1, " ");
        while (que1.hasMoreTokens())
            q1.insert(que1.nextToken());

        StringTokenizer que2 = new StringTokenizer(dataForQ2, " ");
        while (que2.hasMoreTokens())
            q2.insert(que2.nextToken());

        StringTokenizer que3 = new StringTokenizer(dataForQ3, " ");
        while (que3.hasMoreTokens())
            q3.insert(que3.nextToken());

        System.out.println("s1 size: " + s1.size());
        System.out.println("s2 size: " + s2.size());
        System.out.println("s3 size: " + s3.size());
        System.out.println("q1 size: " + q1.size());
        System.out.println("q2 size: " + q2.size());
        System.out.println("q3 size: " + q3.size());

        System.out.println(s1.equals(s2)? "S1 stack and S2 stack are equal.": "S1 and S2 Stack are not equal.");
        System.out.println(s1.equals(s3)? "S1 stack and S3 stack are equal.": "S1 and S3 Stack are not equal.");
        System.out.println(s2.equals(s3)? "S2 stack and S3 stack are equal.": "S2 and S3 Stack are not equal.");
        System.out.println(q1.equals(q2)? "Q1 stack and Q2 stack are equal.": "Q1 and Q2 Stack are not equal.");
        System.out.println(q1.equals(q3)? "Q1 stack and Q3 stack are equal.": "Q1 and Q3 Stack are not equal.");
        System.out.println(q2.equals(q3)? "Q1 stack and Q3 stack are equal.": "Q2 and Q3 Stack are not equal.");


    }


}
package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Demo01streams {
    int[]numbers= {1,2,34,67};
    IntStream numStream=Arrays.stream(numbers);

   void makeforEach(){
    numStream.forEach(number->{

    });
        
    }
    public static void main(String[] args) {
        Demo01streams demo=new Demo01streams();
        demo.makeforEach();
        
    }
}

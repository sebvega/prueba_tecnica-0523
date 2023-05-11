package dummyExample.put;

import com.intuit.karate.junit5.Karate;

public class PutRunner {

    @Karate.Test
    Karate PutRunner(){

        return Karate.run().relativeTo(getClass());
    }

}

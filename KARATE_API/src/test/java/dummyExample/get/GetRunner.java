package dummyExample.get;

import com.intuit.karate.junit5.Karate;

public class GetRunner {

    @Karate.Test
    Karate GetRunner(){

        return Karate.run().relativeTo(getClass());
    }

}

package dummyExample.post;

import com.intuit.karate.junit5.Karate;

public class PostRunner {

    @Karate.Test
    Karate PostRunner(){

        return Karate.run().relativeTo(getClass());
    }

}

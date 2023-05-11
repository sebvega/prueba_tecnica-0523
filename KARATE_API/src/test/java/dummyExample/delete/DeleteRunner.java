package dummyExample.delete;

import com.intuit.karate.junit5.Karate;

public class DeleteRunner {

    @Karate.Test
    Karate DeleteRunner() {

        return Karate.run().relativeTo(getClass());
    }

}

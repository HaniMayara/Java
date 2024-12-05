import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class WeatherDataTest {

    private WeatherData weatherData = new WeatherData();

    String testEmpty() {
        List<Float> values = Collections.emptyList();
        float result = weatherData.computeAv(values);
        
        if (Float.isNaN(result)){return "Valide";
        }else {return "The result should be NaN for an empty list";
    }
    }
    
    void testPositive() {
        List<Float> values = Arrays.asList(2.5f, 3.5f, 4.0f);
        float expectedAverage = 3.3333333f;
        float result = weatherData.computeAv(values);
        assertEquals(expectedAverage, result, 1e-5, "The average should be approximately 3.33333");
    }

    String testSingleValue() {
        List<Float> values = Collections.singletonList(5.0f);
        float expectedAverage = 5.0f;
        float result = weatherData.computeAv(values);
        if (expectedAverage == result ){return "Valide";
        }else {return "The average of a single-element list should be the element itself";
    }
    }


    void testMixedValues() {
        List<Float> values = Arrays.asList(-1.0f, 2.0f, 5.0f, -3.0f);
        float expectedAverage = 0.75f;
        float result = weatherData.computeAv(values);
        assertEquals(expectedAverage, result, 1e-5, "The average of mixed values should be 0.75");
    }



}

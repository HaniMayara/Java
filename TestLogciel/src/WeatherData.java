import java.util.List;

public class WeatherData {
	//premier essai
//    public float computeAv(List<Float> values) {
//        return Float.NaN; 
//    }
	public float computeAv(List<Float> values) {
        // 1ere etape
        if (values.isEmpty()) {
            return Float.NaN;
        }

        // 2eme etape
        float sum = 0;
        for (float value : values) {
            sum += value;
        }
        return sum / values.size();
    }
}
public class IWBService {
    public int calculate (float weight, float height) {
        float IWB = weight*10000/height/height;
        return (int) IWB;
    }
}

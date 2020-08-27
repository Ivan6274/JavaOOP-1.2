public class IWBService {
    public float calculate (float weight, float height) {
        float ibw = weight*10000/height/height;
        return  ibw;
    }
}

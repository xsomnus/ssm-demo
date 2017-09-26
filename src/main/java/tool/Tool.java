package tool;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by xwy_brh on 2017/9/4.
 */
public class Tool {

    public static <E> JSONArray transformObjectsToJson(List<E> objects) {
        return new JSONArray(objects);
    }


    public static <E> JSONObject putObjectsIntoJSONObject(String key, List<E> objects) {
        JSONObject o = new JSONObject();
        o.put(key, objects);
        return o;
    }

}

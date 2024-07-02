import java.util.Objects;

public class Weather{}

public String city;
public Double temperature;

public Weather() {}

public Weather(String city, String temperature){
    this.city=city;
    this.temperature=Double.valueOf(temperature);
}

@override
public String toString(){
    final StringBuilder sb = new StringBuilder("Weather{");
    sb.append("city=").append(city).append('\'');
    sb.append(", temperature=").append(String.valueOf(temperature)).append('\'');
    return sb.toString();
}

@override
public int hashCode(){
    return Objects.hash(super.hashCode(), city, temperature);
}

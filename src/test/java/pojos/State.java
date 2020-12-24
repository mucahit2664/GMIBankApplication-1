package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tpcountry")
    private Object tpcountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tpcountry")
    public Object getTpcountry() {
        return tpcountry;
    }

    @JsonProperty("tpcountry")
    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public State() {
    }
    public State(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public State(String name, Object tpcountry) {
        this.name = name;
        this.tpcountry = tpcountry;
    }

    public State(Integer id, String name, Object tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("tpcountry", tpcountry).append("additionalProperties", additionalProperties).toString();
    }
}

package spring.in.action.spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by shliangyan on 2017/9/19.
 */
public class Spittle {
    private final Long id;

    @NotNull
    @Size(min = 5, max = 16)
    private final String message;

    @NotNull
    @Size(min = 5, max = 25)
    private final Date time;

    private Double latitude;

    private Double longitude;


    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle(String message, Date time, Double latitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Spittle spittle = (Spittle) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, spittle.id)
                .append(message, spittle.message)
                .append(time, spittle.time)
                .append(latitude, spittle.latitude)
                .append(longitude, spittle.longitude)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(id)
                .append(message)
                .append(time)
                .append(latitude)
                .append(longitude)
                .toHashCode();
    }
}

package pjatk.jazs21166nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity(name = "response")
public class Nbp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id of the record", required = true, value = "id", example = "1")
    private Long id;
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(notes = "Name of the metal", required = true, value = "metal", example = "Gold")
    private MetalCategory metal;
    @ApiModelProperty(notes = "Price of the metal", required = true, value = "averagePrice", example = "7034,55")
    private float averagePrice;
    @ApiModelProperty(notes = "Time frame, date From", required = true, value = "dateFrom", example = "2021-05-25")
    private Date dateFrom;
    @ApiModelProperty(notes = "Time frame, date to", required = true, value = "dateTo", example = "2021-05-26")
    private Date dateTo;
    @ApiModelProperty(notes = "Day and time of the request", required = true, value = "requestTime", example = "17:34:55")
    private Timestamp requestTime;

    public Nbp() {
    }

    public Nbp(Long id, MetalCategory metal, float averagePrice, Date dateFrom, Date dateTo, Timestamp requestTime) {
        this.id = id;
        this.metal = metal;
        this.averagePrice = averagePrice;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.requestTime = requestTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MetalCategory getMetal() {
        return metal;
    }

    public void setMetal(MetalCategory metal) {
        this.metal = metal;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }
}

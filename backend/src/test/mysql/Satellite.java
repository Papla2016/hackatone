package test.mysql;

import com.mysql.cj.xdevapi.JsonValue;

import static com.mysql.cj.xdevapi.JsonLiteral.NULL;

public class Satellite {
    private int id;
    private int speed;
    private JsonValue orbit;
    private String status;
    public int getId(){
        return id;
    }
    public int getSpeed(){
        return speed;
    }
    public JsonValue getOrbit(){
        return orbit;
    }
    public String getStatus(){
        return status;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setOrbit(JsonValue orbit){
        this.orbit = orbit;
    }
    public Satellite(int id, int speed, String status, JsonValue orbit){
        this.id =id;
        this.orbit = orbit;
        this.speed = speed;
        this.status = status;
    }
    public Satellite(int id, String status, JsonValue orbit){
        this.id =id;
        this.orbit = orbit;
        this.speed = 0;
        this.status = status;
    }
    public Satellite(int id, int speed, JsonValue orbit){
        this.id =id;
        this.orbit = orbit;
        this.speed = speed;
        this.status = "NULL";
    }
    public Satellite(int id, int speed, String status){
        this.id =id;
        this.orbit = null;
        this.speed = speed;
        this.status = status;
    }
    public Satellite(int id, JsonValue orbit){
        this.id =id;
        this.orbit = orbit;
        this.speed = 0;
        this.status = "NULL";
    }
    public Satellite(int id, String status){
        this.id =id;
        this.orbit = null;
        this.speed = 0;
        this.status = status;
    }
    public Satellite(int id, int speed){
        this.id =id;
        this.orbit = null;
        this.speed = speed;
        this.status = "null";
    }
    public Satellite(int id){
        this.id =id;
        this.orbit = null;
        this.speed = 0;
        this.status = "null";
    }


}

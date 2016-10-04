
public class Types {
    private String[] supported = {"byte",
            "short", "int", "float", "long", "double",
            "boolean", "char"
    };
    private String defaultType;

    protected String type(){
        return defaultType;
    }

    protected void setType(String type){
        defaultType = type;
    }

    private boolean _has(String target){
        for (String i:supported) {
            if (i.equals(target)){
                return true;
            }
        }
        return false;
    }

    public Types(String type) throws Exception{
        if (_has(type)) {
            defaultType = type;
        }
        else{
            throw new Exception(type+" was not one of "+ String.join(", ", supported));
        }
    }

    public Types()
    {
        defaultType = supported[0];
    }

    protected int getMax(int i){
        return 2147483647;
    }

    protected int getMin(int i){
        return getMax(i) + 1;
    }

    protected byte getMax(byte b){
        return 127;
    }
    protected byte getMin(byte b){
        return -128;
    }

    protected short getMax(short s){
        return 32767;
    }

    protected short getMin(short s){
        return -32728;
    }

    protected long getMax(long l){
        l = 9223372036854775807L;
        return l;

    }

    protected long getMin(long l){
        return getMax(l) + 1;
    }

    protected float getMax(float f){
        //f = Float.intBitsToFloat((int) 0xff7fffff);
        f = Float.MAX_VALUE;
        return f;
    }

    protected float getMin(float f){
        //f = Float.intBitsToFloat((int) 0xff800000);
        f = -Float.MAX_VALUE;
        return f;
    }

    protected double getMax(double d){
        return Double.MAX_VALUE;
    }

    protected double getMin(double d){
        return Double.MIN_VALUE;
    }

    protected boolean getMax(boolean b){
        return true;
    }

    protected boolean getMin(boolean b){
        return false;
    }

    protected String getMax(char ch){
        //ch = Character.MAX_VALUE;
        return "\\u0000";
    }

    protected String getMin(char ch){
        //ch = Character.MIN_VALUE;
        return "\\uffff";
    }



}

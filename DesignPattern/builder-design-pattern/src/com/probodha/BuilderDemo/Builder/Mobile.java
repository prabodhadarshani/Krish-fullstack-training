package com.probodha.BuilderDemo.Builder;

public class Mobile {
    //required parameters

    private String NOKIA;
    private String APPLE;
    private String REDMI;


    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Mobile(Builder builder) {
         this.REDMI = builder.REDMI;
        this.NOKIA = builder.NOKIA;
        this.APPLE = builder.APPLE;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public String getNOKIA() {
        return NOKIA;
    }
    public String getAPPLE() {
        return APPLE;
    }
    public String getREDMI() {
        return REDMI;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class Builder{
        //required parameters
        private String APPLE;
        private String NOKIA;
        private String REDMI;


        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String redmi, String nokiya, String apple) {
            this.REDMI = redmi;
            this.NOKIA = nokiya;
            this.APPLE = apple;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Mobile build() {
            return new Mobile(this);
        }
    }


}

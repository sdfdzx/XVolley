package com.study.xuan.xvolley;

import java.util.List;

/**
 * Author : xuan.
 * Data : 2017/8/29.
 * Description :input the description of this file.
 */

public class weather {

    /**
     * message : Success !
     * status : 200
     * city : 北京
     * count : 1
     * data : {"shidu":"55%","pm25":12,"pm10":29,"quality":"优","wendu":"20","ganmao":"各类人群可自由活动",
     * "yesterday":{"date":"27日星期日","sunrise":"05:36","high":"高温 18.0℃","low":"低温 17.0℃",
     * "sunset":"18:55","aqi":29,"fx":"东风","fl":"<3级","type":"阵雨","notice":"突如其来的雨，总叫让人措手不及"},
     * "forecast":[{"date":"28日星期一","sunrise":"05:37","high":"高温 28.0℃","low":"低温 16.0℃",
     * "sunset":"18:53","aqi":34,"fx":"北风","fl":"3-4级","type":"晴","notice":"lovely
     * sunshine，尽情享受阳光的温暖吧"},{"date":"29日星期二","sunrise":"05:38","high":"高温 25.0℃","low":"低温
     * 16.0℃","sunset":"18:52","aqi":41,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely
     * sunshine，尽情享受阳光的温暖吧"},{"date":"30日星期三","sunrise":"05:39","high":"高温 27.0℃","low":"低温
     * 18.0℃","sunset":"18:50","aqi":55,"fx":"西南风","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},
     * {"date":"31日星期四","sunrise":"05:40","high":"高温 26.0℃","low":"低温 17.0℃","sunset":"18:49",
     * "aqi":59,"fx":"北风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"01日星期五",
     * "sunrise":"05:41","high":"高温 27.0℃","low":"低温 18.0℃","sunset":"18:47","aqi":65,"fx":"西南风",
     * "fl":"<3级","type":"阴","notice":"阴天没有晴天的明朗，却依然明亮"}]}
     */

    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shidu : 55%
         * pm25 : 12
         * pm10 : 29
         * quality : 优
         * wendu : 20
         * ganmao : 各类人群可自由活动
         * yesterday : {"date":"27日星期日","sunrise":"05:36","high":"高温 18.0℃","low":"低温 17.0℃",
         * "sunset":"18:55","aqi":29,"fx":"东风","fl":"<3级","type":"阵雨","notice":"突如其来的雨，总叫让人措手不及"}
         * forecast : [{"date":"28日星期一","sunrise":"05:37","high":"高温 28.0℃","low":"低温 16.0℃",
         * "sunset":"18:53","aqi":34,"fx":"北风","fl":"3-4级","type":"晴","notice":"lovely
         * sunshine，尽情享受阳光的温暖吧"},{"date":"29日星期二","sunrise":"05:38","high":"高温 25.0℃","low":"低温
         * 16.0℃","sunset":"18:52","aqi":41,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely
         * sunshine，尽情享受阳光的温暖吧"},{"date":"30日星期三","sunrise":"05:39","high":"高温 27.0℃","low":"低温
         * 18.0℃","sunset":"18:50","aqi":55,"fx":"西南风","fl":"<3级","type":"晴",
         * "notice":"晴空万里，去沐浴阳光吧"},{"date":"31日星期四","sunrise":"05:40","high":"高温 26.0℃","low":"低温
         * 17.0℃","sunset":"18:49","aqi":59,"fx":"北风","fl":"<3级","type":"阴",
         * "notice":"阴天是彩虹的前期之景"},{"date":"01日星期五","sunrise":"05:41","high":"高温 27.0℃","low":"低温
         * 18.0℃","sunset":"18:47","aqi":65,"fx":"西南风","fl":"<3级","type":"阴",
         * "notice":"阴天没有晴天的明朗，却依然明亮"}]
         */

        private String shidu;
        private int pm25;
        private int pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public int getPm25() {
            return pm25;
        }

        public void setPm25(int pm25) {
            this.pm25 = pm25;
        }

        public int getPm10() {
            return pm10;
        }

        public void setPm10(int pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 27日星期日
             * sunrise : 05:36
             * high : 高温 18.0℃
             * low : 低温 17.0℃
             * sunset : 18:55
             * aqi : 29
             * fx : 东风
             * fl : <3级
             * type : 阵雨
             * notice : 突如其来的雨，总叫让人措手不及
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }

        public static class ForecastBean {
            /**
             * date : 28日星期一
             * sunrise : 05:37
             * high : 高温 28.0℃
             * low : 低温 16.0℃
             * sunset : 18:53
             * aqi : 34
             * fx : 北风
             * fl : 3-4级
             * type : 晴
             * notice : lovely sunshine，尽情享受阳光的温暖吧
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
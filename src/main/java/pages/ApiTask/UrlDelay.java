package pages.ApiTask;

public class UrlDelay {
        private String origin;
        private String url;

    public UrlDelay(String data, String origin, String url) {
        this.origin = origin;
        this.url = url;
    }


        public String getOrigin() {
            return origin;
        }

        public String getUrl() {
            return url;
        }
    }



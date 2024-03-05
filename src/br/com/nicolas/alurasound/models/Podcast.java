package br.com.nicolas.alurasound.models;

public class Podcast extends Audio {
    private String host;
    private int episode;
    private String topic;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Episode n." + episode + "\nTopic: " + topic +
                "\nHosted by: " + host);
    }

}

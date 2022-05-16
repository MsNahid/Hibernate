package org.nahidsohel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Song {

    @Id
    @Column(name = "song_id")
    private int songId;

    @Column(name = "song_name")
    private String songName;

    @Column(name = "song_artist")
    private String songArtist;
}

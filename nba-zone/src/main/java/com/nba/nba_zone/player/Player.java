package com.nba.nba_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name="name", unique=true)
    private String name;
    private Integer age;
    private String team;
    private String position;
    private Integer games_played;
    private Integer fg_made;
    private Integer fg_attempt;
    private Double fg_percent;
    private Integer three_made;
    private Integer three_attempt;
    private Double three_percent;
    private Integer ft_made;
    private Integer ft_attempt;
    private Double ft_percent;
    private Integer rebound;
    private Integer assist;
    private Integer steal;
    private Integer block;
    private Integer turnover;
    private Integer point;



    public Player(String name, Integer age, String team, String position, Integer games_played, Integer fg_made, Integer fg_attempt, Double fg_percent, Integer three_made, Integer three_attempt, Double three_percent, Integer ft_made, Integer ft_attempt, Double ft_percent, Integer rebound, Integer assist, Integer steal, Integer block, Integer point, Integer turnover) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.position = position;
        this.games_played = games_played;
        this.fg_made = fg_made;
        this.fg_attempt = fg_attempt;
        this.fg_percent = fg_percent;
        this.three_made = three_made;
        this.three_attempt = three_attempt;
        this.three_percent = three_percent;
        this.ft_made = ft_made;
        this.ft_attempt = ft_attempt;
        this.ft_percent = ft_percent;
        this.rebound = rebound;
        this.assist = assist;
        this.steal = steal;
        this.block = block;
        this.point = point;
        this.turnover = turnover;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getFg_made() {
        return fg_made;
    }

    public void setFg_made(Integer fg_made) {
        this.fg_made = fg_made;
    }

    public Integer getFg_attempt() {
        return fg_attempt;
    }

    public void setFg_attempt(Integer fg_attempt) {
        this.fg_attempt = fg_attempt;
    }

    public Double getFg_percent() {
        return fg_percent;
    }

    public void setFg_percent(Double fg_percent) {
        this.fg_percent = fg_percent;
    }

    public Integer getThree_made() {
        return three_made;
    }

    public void setThree_made(Integer three_made) {
        this.three_made = three_made;
    }

    public Integer getThree_attempt() {
        return three_attempt;
    }

    public void setThree_attempt(Integer three_attempt) {
        this.three_attempt = three_attempt;
    }

    public Double getThree_percent() {
        return three_percent;
    }

    public void setThree_percent(Double three_percent) {
        this.three_percent = three_percent;
    }

    public Integer getFt_made() {
        return ft_made;
    }

    public void setFt_made(Integer ft_made) {
        this.ft_made = ft_made;
    }

    public Integer getFt_attempt() {
        return ft_attempt;
    }

    public void setFt_attempt(Integer ft_attempt) {
        this.ft_attempt = ft_attempt;
    }

    public Double getFt_percent() {
        return ft_percent;
    }

    public void setFt_percent(Double ft_percent) {
        this.ft_percent = ft_percent;
    }

    public Integer getRebound() {
        return rebound;
    }

    public void setRebound(Integer rebound) {
        this.rebound = rebound;
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = assist;
    }

    public Integer getSteal() {
        return steal;
    }

    public void setSteal(Integer steal) {
        this.steal = steal;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}

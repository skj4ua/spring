package com.example.BlogSystem.models;

import java.util.HashSet;
import java.util.Set;

public class User {

	private Long id;
	private String username;
	private String passwordHash;
	private String fullName;
	private Set<Post> posts = new HashSet<>();
	
    public User(Long id, String username, String passwordHash, String fullName) {
		super();
		this.id = id;
		this.username = username;
		this.passwordHash = passwordHash;
		this.fullName = fullName;
	}
	
	
	public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passHash) { this.passwordHash = passHash; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public Set<Post> getPosts() { return posts; }
    public void setPosts(Set<Post> posts) { this.posts = posts; }

	public User() { }
    public User(Long id, String username, String fullName) { 
         this.id = id; this.username = username; this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' +
            ", passwordHash='" + passwordHash + '\'' +
            ", fullName='" + fullName + '\'' + '}';
    }
	}



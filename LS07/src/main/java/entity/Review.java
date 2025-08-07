package entity;

import jakarta.validation.constraints.*;

public class Review {
    @NotNull(message = "Tên không được để trống")
    private String username;

    @NotNull(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @Min(value = 1, message = "Đánh giá ít nhất là 1 sao")
    @Max(value = 5, message = "Đánh giá tối đa là 5 sao")
    private int rating;

    @Size(max = 200, message = "Bình luận không được vượt quá 200 ký tự")
    private String comment;

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}

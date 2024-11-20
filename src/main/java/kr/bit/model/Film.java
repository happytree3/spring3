package kr.bit.model;

import java.math.BigDecimal;
import java.util.Set;

public class Film {

	    private int filmId;
	    private String title;
	    private String description;
	    private Short releaseYear;
	    private byte languageId;
	    private Byte originalLanguageId;
	    private byte rentalDuration;
	    private BigDecimal rentalRate;
	    private Short length;
	    private BigDecimal replacementCost;
	    private String rating;
	    private Set<String> specialFeatures;
	    
	    // 생성자
	    public Film() {}
	   
	    
	    // Getter 와 Setter 메서드
		public int getFilmId() {
			return filmId;
		}
		public void setFilmId(int filmId) {
			this.filmId = filmId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Short getReleaseYear() {
			return releaseYear;
		}
		public void setReleaseYear(Short releaseYear) {
			this.releaseYear = releaseYear;
		}
		public byte getLanguageId() {
			return languageId;
		}
		public void setLanguageId(byte languageId) {
			this.languageId = languageId;
		}
		public Byte getOriginalLanguageId() {
			return originalLanguageId;
		}
		public void setOriginalLanguageId(Byte originalLanguageId) {
			this.originalLanguageId = originalLanguageId;
		}
		public byte getRentalDuration() {
			return rentalDuration;
		}
		public void setRentalDuration(byte rentalDuration) {
			this.rentalDuration = rentalDuration;
		}
		public BigDecimal getRentalRate() {
			return rentalRate;
		}
		public void setRentalRate(BigDecimal rentalRate) {
			this.rentalRate = rentalRate;
		}
		public Short getLength() {
			return length;
		}
		public void setLength(Short length) {
			this.length = length;
		}
		public BigDecimal getReplacementCost() {
			return replacementCost;
		}
		public void setReplacementCost(BigDecimal replacementCost) {
			this.replacementCost = replacementCost;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		public Set<String> getSpecialFeatures() {
			return specialFeatures;
		}
		public void setSpecialFeatures(Set<String> specialFeatures) {
			this.specialFeatures = specialFeatures;
		}
	    
	    
}

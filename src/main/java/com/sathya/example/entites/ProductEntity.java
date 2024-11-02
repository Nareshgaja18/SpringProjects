package com.sathya.example.entites;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 private String proName;
 private double proPrice;
 private double disPrice;
 private String proBrand;
 private String proDescription;
 //private String proImage;
 private String proCategory;
 private LocalDateTime createdAt;
 private String createdBy;
 public long getId() {
  return id;
 }
 public void setId(long id) {
  this.id = id;
 }
 public String getProName() {
  return proName;
 }
 public void setProName(String proName) {
  this.proName = proName;
 }
 public double getProPrice() {
  return proPrice;
 }
 public void setProPrice(double proPrice) {
  this.proPrice = proPrice;
 }
 public double getDisPrice() {
  return disPrice;
 }
 public void setDisPrice(double disPrice) {
  this.disPrice = disPrice;
 }
 public String getProBrand() {
  return proBrand;
 }
 public void setProBrand(String proBrand) {
  this.proBrand = proBrand;
 }
 public String getProDescription() {
  return proDescription;
 }
 public void setProDescription(String proDescription) {
  this.proDescription = proDescription;
 }
 public String getProCategory() {
  return proCategory;
 }
 public void setProCategory(String proCategory) {
  this.proCategory = proCategory;
 }
 public LocalDateTime getCreatedAt() {
  return createdAt;
 }
 public void setCreatedAt(LocalDateTime createdAt) {
  this.createdAt = createdAt;
 }
 public String getCreatedBy() {
  return createdBy;
 }
 public void setCreatedBy(String createdBy) {
  this.createdBy = createdBy;
 }
 
 
}
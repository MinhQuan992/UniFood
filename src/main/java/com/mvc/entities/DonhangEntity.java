package com.mvc.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "DONHANG", schema = "dbo", catalog = "UNIFOOD")
public class DonhangEntity {
    private Integer maDon;
    private Integer maGio;
    private String maGiamGia;
    private String maDonViGiaoHang;
    private String ttDonHang;
    private Boolean ttThanhToan;
    private Integer tongGiaTri;
    private Date ngayDat;
    private Date ngayGiaoHang;
    private Date ngayThanhToan;

    @Id
    @Column(name = "MaDon", columnDefinition = "INT")
    public Integer getMaDon() {
        return maDon;
    }

    public void setMaDon(Integer maDon) {
        this.maDon = maDon;
    }

    @Basic
    @Column(name = "MaGio", columnDefinition = "INT")
    public Integer getMaGio() {
        return maGio;
    }

    public void setMaGio(Integer maGio) {
        this.maGio = maGio;
    }

    @Basic
    @Column(name = "MaDonViGiaoHang", columnDefinition = "VARCHAR(10)")
    public String getMaDonViGiaoHang() {
        return maDonViGiaoHang;
    }

    public void setMaDonViGiaoHang(String maDonViGiaoHang) {
        this.maDonViGiaoHang = maDonViGiaoHang;
    }

    @Basic
    @Column(name = "TT_DonHang", columnDefinition = "NVARCHAR(50)")
    public String getTtDonHang() {
        return ttDonHang;
    }

    public void setTtDonHang(String ttDonHang) {
        this.ttDonHang = ttDonHang;
    }

    @Basic
    @Column(name = "TT_ThanhToan", columnDefinition = "BIT")
    public Boolean getTtThanhToan() {
        return ttThanhToan;
    }

    public void setTtThanhToan(Boolean ttThanhToan) {
        this.ttThanhToan = ttThanhToan;
    }

    @Basic
    @Column(name = "TongGiaTri", columnDefinition = "INT")
    public Integer getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(Integer tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    @Basic
    @Column(name = "NgayDat", columnDefinition = "DATE")
    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    @Basic
    @Column(name = "NgayGiaoHang", columnDefinition = "DATE")
    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    @Basic
    @Column(name = "NgayThanhToan", columnDefinition = "DATE")
    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonhangEntity that = (DonhangEntity) o;

        if (maDon != null ? !maDon.equals(that.maDon) : that.maDon != null) return false;
        if (maGio != null ? !maGio.equals(that.maGio) : that.maGio != null) return false;
        if (maGiamGia != null ? !maGiamGia.equals(that.maGiamGia) : that.maGiamGia != null) return false;
        if (maDonViGiaoHang != null ? !maDonViGiaoHang.equals(that.maDonViGiaoHang) : that.maDonViGiaoHang != null)
            return false;
        if (ttDonHang != null ? !ttDonHang.equals(that.ttDonHang) : that.ttDonHang != null) return false;
        if (ttThanhToan != null ? !ttThanhToan.equals(that.ttThanhToan) : that.ttThanhToan != null) return false;
        if (tongGiaTri != null ? !tongGiaTri.equals(that.tongGiaTri) : that.tongGiaTri != null) return false;
        if (ngayDat != null ? !ngayDat.equals(that.ngayDat) : that.ngayDat != null) return false;
        if (ngayGiaoHang != null ? !ngayGiaoHang.equals(that.ngayGiaoHang) : that.ngayGiaoHang != null) return false;
        if (ngayThanhToan != null ? !ngayThanhToan.equals(that.ngayThanhToan) : that.ngayThanhToan != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maDon != null ? maDon.hashCode() : 0;
        result = 31 * result + (maGio != null ? maGio.hashCode() : 0);
        result = 31 * result + (maGiamGia != null ? maGiamGia.hashCode() : 0);
        result = 31 * result + (maDonViGiaoHang != null ? maDonViGiaoHang.hashCode() : 0);
        result = 31 * result + (ttDonHang != null ? ttDonHang.hashCode() : 0);
        result = 31 * result + (ttThanhToan != null ? ttThanhToan.hashCode() : 0);
        result = 31 * result + (tongGiaTri != null ? tongGiaTri.hashCode() : 0);
        result = 31 * result + (ngayDat != null ? ngayDat.hashCode() : 0);
        result = 31 * result + (ngayGiaoHang != null ? ngayGiaoHang.hashCode() : 0);
        result = 31 * result + (ngayThanhToan != null ? ngayThanhToan.hashCode() : 0);
        return result;
    }
}

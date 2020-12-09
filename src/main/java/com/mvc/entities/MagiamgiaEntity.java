package com.mvc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "MAGIAMGIA", schema = "dbo", catalog = "UNIFOOD")
public class MagiamgiaEntity {
    private String tenMa;
    private Short gtDuocGiam;
    private Integer gtghToiThieu;
    private Short soLuong;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private Collection<DonhangEntity> donhangsByTenMa;

    @Id
    @Column(name = "TenMa")
    public String getTenMa() {
        return tenMa;
    }

    public void setTenMa(String tenMa) {
        this.tenMa = tenMa;
    }

    @Basic
    @Column(name = "GTDuocGiam")
    public Short getGtDuocGiam() {
        return gtDuocGiam;
    }

    public void setGtDuocGiam(Short gtDuocGiam) {
        this.gtDuocGiam = gtDuocGiam;
    }

    @Basic
    @Column(name = "GTGHToiThieu")
    public Integer getGtghToiThieu() {
        return gtghToiThieu;
    }

    public void setGtghToiThieu(Integer gtghToiThieu) {
        this.gtghToiThieu = gtghToiThieu;
    }

    @Basic
    @Column(name = "SoLuong")
    public Short getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Short soLuong) {
        this.soLuong = soLuong;
    }

    @Basic
    @Column(name = "NgayBatDau")
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    @Basic
    @Column(name = "NgayKetThuc")
    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MagiamgiaEntity that = (MagiamgiaEntity) o;

        if (tenMa != null ? !tenMa.equals(that.tenMa) : that.tenMa != null) return false;
        if (gtDuocGiam != null ? !gtDuocGiam.equals(that.gtDuocGiam) : that.gtDuocGiam != null) return false;
        if (gtghToiThieu != null ? !gtghToiThieu.equals(that.gtghToiThieu) : that.gtghToiThieu != null) return false;
        if (soLuong != null ? !soLuong.equals(that.soLuong) : that.soLuong != null) return false;
        if (ngayBatDau != null ? !ngayBatDau.equals(that.ngayBatDau) : that.ngayBatDau != null) return false;
        if (ngayKetThuc != null ? !ngayKetThuc.equals(that.ngayKetThuc) : that.ngayKetThuc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tenMa != null ? tenMa.hashCode() : 0;
        result = 31 * result + (gtDuocGiam != null ? gtDuocGiam.hashCode() : 0);
        result = 31 * result + (gtghToiThieu != null ? gtghToiThieu.hashCode() : 0);
        result = 31 * result + (soLuong != null ? soLuong.hashCode() : 0);
        result = 31 * result + (ngayBatDau != null ? ngayBatDau.hashCode() : 0);
        result = 31 * result + (ngayKetThuc != null ? ngayKetThuc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "magiamgiaByMaGiamGia")
    public Collection<DonhangEntity> getDonhangsByTenMa() {
        return donhangsByTenMa;
    }

    public void setDonhangsByTenMa(Collection<DonhangEntity> donhangsByTenMa) {
        this.donhangsByTenMa = donhangsByTenMa;
    }
}
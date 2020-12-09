package com.mvc.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "DONVIGIAOHANG", schema = "dbo", catalog = "UNIFOOD")
public class DonvigiaohangEntity {
    private String maDonVi;
    private String tenDonVi;
    private String diaChi;
    private Collection<DonhangEntity> donhangsByMaDonVi;

    @Id
    @Column(name = "MaDonVi")
    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    @Basic
    @Column(name = "TenDonVi")
    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    @Basic
    @Column(name = "DiaChi")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonvigiaohangEntity that = (DonvigiaohangEntity) o;

        if (maDonVi != null ? !maDonVi.equals(that.maDonVi) : that.maDonVi != null) return false;
        if (tenDonVi != null ? !tenDonVi.equals(that.tenDonVi) : that.tenDonVi != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maDonVi != null ? maDonVi.hashCode() : 0;
        result = 31 * result + (tenDonVi != null ? tenDonVi.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "donvigiaohangByMaDonViGiaoHang")
    public Collection<DonhangEntity> getDonhangsByMaDonVi() {
        return donhangsByMaDonVi;
    }

    public void setDonhangsByMaDonVi(Collection<DonhangEntity> donhangsByMaDonVi) {
        this.donhangsByMaDonVi = donhangsByMaDonVi;
    }
}

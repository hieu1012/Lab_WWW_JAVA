package iuh.fit.se.tuan4_tintuc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name ="DANHMUC")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MADM")
    private long maDanhMuc;

    @Column(name = "TENDANHMUC")
    private String tenDanhMuc;

    @Column(name = "NGUOIQUANLY")
    private String nguoiQuanLy;

    @Column(name = "GHICHU")
    private String ghiChu;

    @OneToMany(mappedBy = "danhMuc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<TinTuc> tinTucList;
}

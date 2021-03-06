
package jpaperf


import scala.beans.BeanProperty
import javax.persistence._
import java.util.List
import java.util.ArrayList


@Entity
@Table(name = "PAY_TD_ACCOUNT")
class PayAccount {

  @BeanProperty
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _

  @BeanProperty
  @Column
  var amount: Double = _

  @BeanProperty
  @Column
  var reserved: Double = _

  @BeanProperty
  @ManyToOne
  @JoinColumn(name = "user_id")
  var userId: MainUser = _

  @BeanProperty
  @OneToMany(cascade = Array(CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE), fetch = FetchType.LAZY)
  @JoinColumn(name = "account_id")
  var payAccountItemList: List[PayAccountItem] = new ArrayList[PayAccountItem]


}
        

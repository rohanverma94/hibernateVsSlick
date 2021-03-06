
package jpaperf


import scala.beans.BeanProperty
import javax.persistence._
import java.sql.Timestamp


@Entity
class PayAccountItem {


  @BeanProperty
  @Id
  var id: Long = _


  @BeanProperty
  @Column
  var amount: String = _

  @BeanProperty
  @Column
  var transactionType: Long = _

  @BeanProperty
  @Column
  var inserted: Timestamp = _


  @BeanProperty
  @ManyToOne
  @JoinColumn(name = "account_id")
  var accountId: PayAccount = _


}
        

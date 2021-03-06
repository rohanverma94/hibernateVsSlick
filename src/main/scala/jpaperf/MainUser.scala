
package jpaperf

import scala.beans.BeanProperty
import javax.persistence._
import java.util.List
import java.util.ArrayList


@Entity()
@Table(name = "MAIN_TC_USER")
class MainUser {
  @BeanProperty
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _

  @BeanProperty
  @Column
  var name: String = _

  @BeanProperty
  @Column
  var surname: String = _

  @BeanProperty
  @Column
  var username: String = _

  @BeanProperty
  @Column
  var password: String = _

  @BeanProperty
  @OneToMany(cascade = Array(CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE), fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  var payAccountList: List[PayAccount] = new ArrayList[PayAccount]
}
        

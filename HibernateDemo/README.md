**Data Source** <hr />

```
Datasource means,How it will be connected to database.
```
<br />

**Session Factory** <hr /> 
> - It invokes only once for a database.If it is invoked more than once, then performance issue may arise.
> - It is immutable

<br />

**Transient Entity** <hr />
```
Transient entity fields are fields that do not participate in persistence
and their values are never stored in the database.
```
<br />

**Strategy** <hr />
> - **session.save(obj)** helps pushing object to db.
> - Once the record has been inserted **@GeneratedValue(Strategy = IDENTITY)** helps mapping the assigned pk from database to object.
>    - **@GeneratedValue(Strategy = IDENTITY)** does not generate pk, It only helps mapping the pk from db to java object after **save()** invoked.

<br />

**Object State And Life Cycle** <hr />
> - _Transient State_
>     - The **transient** state is the first state of an entity object. When we instantiate an object of a POJO class using the new operator then the
>       object is in the transient state.
> - Persistent State
>     - Once the object is connected with the Hibernate Session then the object moves into the Persistent State.
> - Detach State
>     - For converting an object from Persistent State to Detached State, we either have to close the session or we have to clear its cache.
> - Remove State
>      - when the entity object is deleted from the database then the entity object is known to be in the removed state.
>   
> 
>    <br />
>
>   ![Life Cycle](GFGHibernateLifecycle.png)

<br />

**Hibernate Automatic Dirty Checking** <hr />
>A dirty session in Hibernate is when  load an object inside the session and then modifies it. Or, open a session and
> create a new object.


**merge vs update**

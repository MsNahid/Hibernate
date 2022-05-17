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
> - Transient
> - Persistent
> - Detach
// function ItemList(){}

import Item from "./Item";

// 위와 동일한 문법 (단, 최신 버전)
const ItemList = ({item_list}) => {
  return(
    <div className='item_list' >
      {
        item_list.map((item, i) => {
        return (
            <Item item={item} key={i}/>
          );
        })
      }
  </div>
  );
}

export default ItemList;
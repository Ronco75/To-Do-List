const form = document.querySelector('#task-form');
const taskList = document.querySelector('.collection');
const clearBtn = document.querySelector('#clear-btn');
const filter = document.querySelector('#filter');
const taskInput = document.querySelector('#task')


form.addEventListener('submit', (e) => {
  
    if (taskInput.value === '') {
        alert('Add Task');
    }

    const li = document.createElement('li');
    li.className = 'collection-item';
    
    li.appendChild(document.createTextNode(taskInput.value));

    const link = document.createElement('a');
    const closeBtn = document.createElement('button')
    closeBtn.className = 'btn-close';

    link.appendChild(closeBtn);

    li.appendChild(link)

    taskList.appendChild(li);

    taskInput.value = '';

        closeBtn.addEventListener('click', () => {
        
            if (confirm('Are You Sure?')) {
                li.remove();
            };

    
        });

    e.preventDefault();
})



clearBtn.addEventListener('click', () => {

    while (taskList.firstChild) {

        taskList.removeChild(taskList.firstChild);
    }


})


filter.addEventListener('keyup', (e) => {
    const text = e.target.value.toLowerCase();
    console.log(text);

    document.querySelectorAll('.collection-item').forEach( (task) => {
        const item = task.firstChild.textContent;
        
        if (item.toLowerCase().indexOf(text) != -1) {
            task.style.display = 'block';
        } else {
            task.style.display = 'none'; 
        }


    });
})
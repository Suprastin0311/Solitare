document.addEventListener('DOMContentLoaded', () => {
    const backgroundImage = document.querySelector('.background-image');
    let lastScrollY = window.scrollY;
    
    window.addEventListener('scroll', () => {
        const scrollY = window.scrollY;
        const windowHeight = window.innerHeight;
        const documentHeight = document.documentElement.scrollHeight;
        
        // Замедляем движение фона
        const parallaxValue = scrollY * 0.3; // Уменьшаем скорость движения фона
        
        // Ограничиваем движение фона нижней частью экрана
        if (parallaxValue <= documentHeight - windowHeight) {
            backgroundImage.style.transform = `translateY(${parallaxValue}px)`;
        }
    });

    // Навигация по меню
    const navLinks = document.querySelectorAll('nav ul li a');
    
    navLinks.forEach(link => {
        link.addEventListener('click', (e) => {
            e.preventDefault();
            const targetId = link.getAttribute('href').substring(1);
            const targetSection = document.getElementById(targetId);
            
            targetSection.scrollIntoView({
                behavior: 'smooth'
            });
        });
    });
});

function navigateToSection(sectionId) {
                            const section = document.getElementById(sectionId);
                            section.scrollIntoView({ behavior: 'smooth' });
                        }